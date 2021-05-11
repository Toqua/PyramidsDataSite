package pyramids;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {
	
	static Map<String,Integer> getPyramidsPerSite(List<Pyramid> plist){
		Map<String,Integer> Pmap =new HashMap<>();
		for(Pyramid p:plist){
			Pmap.put(p.getSite(), Pmap.getOrDefault(p.getSite(), 1) + 1);
		}
		return Pmap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PyramidDAOImpl D = new PyramidDAOImpl();
		List<Pyramid> CSVList = D.readPyramidsFromCSV("pyramids.csv");
		for(Pyramid p:CSVList){
			System.out.println(p.toString());
		}
		System.out.println();
		System.out.println("after sorting");
		System.out.println();
		CSVList.sort(new Comparator<Pyramid>() {
			@Override
			public int compare(Pyramid o1, Pyramid o2) {
					// TODO Auto-generated method stub
					  if(o1.getHeight() > o2.getHeight()) return 1;
					  else if(o1.getHeight() == o2.getHeight())return 0;
					  else return -1;
			}
		});
		for(Pyramid p:CSVList){
			System.out.println(p.toString());
		}
		
		System.out.println();
		System.out.println("Pyramids Per Site");
		System.out.println();
		Map<String,Integer> Pmap1 =  getPyramidsPerSite(CSVList);
		Pmap1.forEach((k,v)-> System.out.println("site=" + k + ", number of pyramids=" + v));
		
	}

}
