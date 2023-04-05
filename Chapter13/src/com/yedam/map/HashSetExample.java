package com.yedam.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		//Key: String , value : integer
		Map<String,Integer> map =new HashMap<>();
		
		//객체 저장
		map.put("고길동",85);
		map.put("김또치",90);
		map.put("고희동",80);
		map.put("김또치",33);
		
		//Entry 수
		System.out.println(" 총 entry 수 : "+map.size());
		
		
		//key 값을 활용한 객체 찾기
		System.out.println(map.get("김또치"));
		System.out.println();
		
		//반복자
		Set<String> keyset = map.keySet();
		
		Iterator<String> keyIterator = keyset.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("key : "+key + "value : "+value);
		}
		
		//Entry 삭제
		map.remove("고길동");
		
		System.out.println("총 Entry 수 : " + map.size());
		
		//EntrySet <k,v> 다 호출... Map.Entry 출력
		
		Set<Map.Entry<String,Integer>> entryset = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> entryIterator = entryset.iterator();
		
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key : "+ key +" vlaue : "+value);
		}
		
		//향상된 for문 활용 방식
		for (Map.Entry<String,Integer> mEntry : entryset) {
			String key = mEntry.getKey();
			Integer value = mEntry.getValue();
			System.out.println("key : "+key + "value : "+value);
		}
		
		
		System.out.println();
		
		map.clear();
		System.out.println(map.size());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
