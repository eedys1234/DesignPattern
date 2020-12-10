package Flyweight;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class FlyweightManager {
	
	private Map<String, Flyweight> pool;
	
	public FlyweightManager() {
		pool = new ConcurrentHashMap<String, Flyweight>();
	}
	
	public Flyweight getFlyweight(String key) {
		
		Flyweight flyweight = pool.get(key);
		
		if(Objects.isNull(flyweight)) {
			flyweight = new Flyweight(key);
			pool.put(key, flyweight);
		}
		
		return flyweight;
	}

}
