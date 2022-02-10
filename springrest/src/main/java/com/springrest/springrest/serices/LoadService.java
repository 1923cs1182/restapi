package com.springrest.springrest.serices;
import java.util.*;

import com.springrest.springrest.entity.Load;

public interface LoadService {
	
	public List<Load> getLoads();
	public Load getLoad(String loadId);
	public void addLoad(Load load);
	public void deleteLoad(String loadId);

}
