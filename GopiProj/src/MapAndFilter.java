import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapAndFilter {
	
	public static void main(String[] args) {
		ArrayList<Shape> arr=new ArrayList<>();
		
		arr.add(new Shape("Red",10));
		arr.add(new Shape("Black",20));
		arr.add(new Shape("Green",30));
		arr.add(new Shape("white",40));
		arr.add(new Shape("green",40));
		arr.add(new Shape("pink",50));
		arr.add(new Shape("yellow",60));
		arr.add(new Shape("blue",70));
		
		arr.stream().filter(x->x.area>=40)
		.map(x->x.area=x.area+1).collect(Collectors.toList()).forEach(x->System.out.println(x));
		
	}

}
