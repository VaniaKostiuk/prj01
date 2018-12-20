package ua.univer;

import java.util.Arrays;

import ua.univer.figures.Figure;
import ua.univer.figures.base.Line;
import ua.univer.figures.base.Point;
import ua.univer.figures.color.ColorAble;
import ua.univer.figures.color.ColorLine;
import ua.univer.figures.color.ColorPoint;
import ua.univer.figures.color.ColorPointAgr;
import ua.univer.figures.poly.PolyPointsDynamic;
import ua.univer.figures.util.FigureFactory;

class Flower implements ColorAble {

	@Override
	public int getColor() {
		// TODO Auto-generated method stub
		return 777;
	}
	
}

public class Program {

	public static void main(String[] args)  {
		System.out.println("-> "+new Object()+1+2+" x "+3*(4+5));
		Point p = new Point(1,2);
		Point p1 = new Point(1,1);
		System.out.println(p);
		System.out.println(p1);
		ColorPoint cp1 = new ColorPoint(2, 3, 333333);
		ColorPointAgr cp2 = new ColorPointAgr(p, 444444);
		System.out.println(cp1);
		System.out.println(cp2);
		Line l1= new Line(p, p1);
		System.out.println(l1);
		Line l2= new Line(6,6,7,7);
		System.out.println(l2);
		Line l3= new Line(new Point(8,8),new Point(9,9));
		System.out.println(l3);
		Line l4= new Line(l2.getBegin(),l3.getEnd());
		ColorLine cl1= new ColorLine(p, p1, 555555)	;
		System.out.println(cl1);
		System.out.println("****************************");
		Figure[] masObj = FigureFactory.getListFigures(80);
		System.out.println(Arrays.toString(masObj));
		System.out.println("****************************");
		
		Point[] masPoint = new Point[masObj.length];            //с общего масива фигур получаем масив точек
		int ipoint = 0 ;
		
		ColorAble [] masColor = new ColorAble[masObj.length];
		int icolor = 0 ;
		
		masColor[icolor++]=new Flower() ;
		masColor[icolor++]=() ->42 ;
		
		
		for (int i = 0; i < masObj.length; i++) {
			if(masObj[i] instanceof ColorAble){
				masColor[icolor++]= (ColorAble) masObj[i];
			}
			if(masObj[i] instanceof Point){
			Point tp =((Point)masObj[i]);
			masPoint[ipoint]=tp;
			ipoint++;
			System.out.println(tp.getX());}
		}
		System.out.println("********************Color");
		for (int i = 0; i < masColor.length; i++) {
		if(masColor[i]!=null)	System.out.println(masColor[i].getColor());
		}
		System.out.println("********************");
		PolyPointsDynamic poly = new PolyPointsDynamic();
		
		
		poly.add(new Point(5,9));
		poly.add(new Point(6,5));
		poly.add(new Point(2,5));
		poly.add(new Point(9,5));
		poly.add(new Point(19,15));
		poly.add(new Point(1,5));
		poly.add(new Point(11,51));
	
	//	for (int i = 0; i < poly.size(); i++) {
	//		System.out.println(poly.get(i));
	//	}
		
		//poly.print(); 
	
	}
	
}
