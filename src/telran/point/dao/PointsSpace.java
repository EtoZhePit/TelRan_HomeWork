package telran.point.dao;

import java.util.Arrays;
import java.util.Comparator;

import telran.point.model.Point;

public class PointsSpace {
	Point relPoint; // точка отсчета
	Point[] points; // Массив который надо отсортировать
	Comparator<Point> comp;

	public PointsSpace(Point relPoint, Point[] points) {
		this.relPoint = relPoint;
		comp = Comparator.comparingDouble(p -> distanceSquared(p, relPoint));
		this.points = Arrays.copyOf(points, points.length);
		Arrays.sort(this.points,comp);


		//TODO sorting this.points by proximity to relPoint (ask to Pithagoras)
		//to apply method sort of class Arrays
	}

	public Point[] getPoints() {
		return points;
	}
	
	public void addPoint(Point point) {
		comp = (a1, a2) -> (int) comparePoints(a1,a2,relPoint);

		int index = Arrays.binarySearch(points, point, comp);
		if (index < 0) {
			index = -index - 1;
		}
		Point[] newPoints = new Point[points.length+1];
		System.arraycopy(points,0,newPoints, 0, index);
		newPoints[index] = point;
		System.arraycopy(points, index, newPoints,index+1,points.length - index);
		points = newPoints;


		//TODO keep sort of this.points
		//to apply method binarySearch of the class Arrays
		//to apply method arrayCopy of the class System
		//method arrayCopy will be called twice
	}

	private double distanceSquared (Point p, Point relPoint) {
		double dx = p.getX() - relPoint.getX();
		double dy = p.getY() - relPoint.getY();

		return dx*dx + dy*dy;
	}

	private double comparePoints (Point a1, Point a2, Point relPoint)  {
	double d1 = distanceSquared(a1,relPoint);
	double d2 = distanceSquared(a2, relPoint);

	return Double.compare(d1,d2);

	}

}
