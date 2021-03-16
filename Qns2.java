public class Qns2{
	public static void main(String args[]){
		Qns2 proj = new Qns2();
    		LinkedHashMap<String, String> map = new LinkedHashMap<>();
  		map.put("ram", "hari");
		map.put("cisco", "barfi");
		map.put("honeywell", "cs");
		map.put("cts", "hari");
		String arrays[]=project.run(map, "hari");
		for (String array : arrays){
		System.out.println(array);
		}
	}


	public String[] run(HashMap<string,String> map, String toFind){
		List<String> keyLists = new ArrayList<>();
		Set<String> keys = map.setKeys();
		for (String key :keys) {
			if (map.get(key).equalsIgnoreCase(toFind)) {
				keyLists.add(key);
			}
	    	}
		
		String array[]= keyLists.toArray(new String[0] );
		return array;
	}

}