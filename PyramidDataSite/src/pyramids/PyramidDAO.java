package pyramids;

import java.util.List;

public interface PyramidDAO {

	public List<Pyramid> readPyramidsFromCSV(String fileName);
	public Pyramid createPyramid(String line);
}
