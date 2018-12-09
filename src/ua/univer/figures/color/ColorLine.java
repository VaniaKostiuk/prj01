package ua.univer.figures.color;

import ua.univer.figures.base.Line;
import ua.univer.figures.base.Point;

public class ColorLine extends Line{
    private int color;
	public ColorLine(Point begin, Point end, int color) {
		super(begin, end);
		this.color= color;
	}
	@Override
	public String toString() {
		return "ColorLine [color=" + color + ", " + super.toString() + "]";
	}
	
}
