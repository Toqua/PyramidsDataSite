package pyramids;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PyramidDAOImpl implements PyramidDAO {

	List<Pyramid> pyramids;
	
	public PyramidDAOImpl() {
		this.pyramids = new ArrayList<Pyramid>();
	}

	@Override
	public List<Pyramid> readPyramidsFromCSV(String fileName) {
		List<Pyramid> Lpyramids = new ArrayList<Pyramid>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = br.readLine();
			//System.out.println(line);
			do{
				line = br.readLine();
				//System.out.println(line);
				if(line!= null){
					Lpyramids.add(createPyramid(line));
				}
			}while(line!=null);
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Lpyramids;
	}

	@Override
	public Pyramid createPyramid(String line) {
		Pyramid p = new Pyramid();
		String[] parts =line.split(",");
		if(!parts[7].equals(""))
			p.setHeight(Double.valueOf(parts[7]));
		else p.setHeight(0.0);
		p.setModernName(parts[2]);
		p.setPharaoh(parts[0]);
		p.setSite(parts[4]);
		return p;
	}

}
