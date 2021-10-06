
/*
 * 니가 사용할 때 타입을 사용해라
 * List<E> list = new ArrayList<E>();
 *
 * Class키워드 Class명 
 * 멤버변수
 * 생성자
 * 멤버함수=멤버메소드
 * 클래스도 오브젝트이기 때문에 타입으로 들어올 수 있음 
 */
package co.jeongeun.prj;

import java.util.*;

import co.jeongeun.prj.vo.Bicle;
import co.jeongeun.prj.vo.Car;
import co.jeongeun.prj.vo.Command;
import co.jeongeun.prj.vo.DevVo;

public class MainApp {

	private static DevVo vo; // VO 객체 인스턴스 정의
	private static MapTest mapTest; // 사용할 객체를 선언
	private static Map<String, Command> map = new HashMap<String, Command>();

	public static void main(String[] args) {
		List<DevVo> list = new ArrayList<DevVo>();
//		
		vo = new DevVo(); // 객체초기화
		vo.setId(1);
		vo.setName("홍길동");
		vo.setAddress("대구광역시 중구");
		vo.setAge(18);
//		
		list.add(vo); // 리스트 구조에 객체 하나를 추가
//		
		vo = new DevVo(); // 객체초기화
		vo.setId(2);
		vo.setName("홍길순");
		vo.setAddress("대구광역시 서구");
		vo.setAge(30);
//		
		list.add(vo);
//		
//		System.out.println(list.get(0).getId());
//		System.out.println(list.get(0).getName());
//		System.out.println(list.get(0).getAddress());
//		System.out.println(list.get(0).getAge());
//		System.out.println("================");
		list.get(1).toString(); // list가 가지고 있는 첫번째 요소를 출력한다.
//		
		for (int i = 0; i < list.size(); i++) {// list 전체출력
			System.out.println(list.get(i).toString());
		}

//	
		System.out.println("====전체가져오기====");
//		
		for (DevVo vo : list) {
			System.out.println(vo.toString());
		}

		mapTest=new MapTest();
		mapTest.setMap("micol", "1234");
		mapTest.setMap("park", "2345");
		mapTest.setMap("lee", "5678");
		mapTest.setMap("kim", "0912");
//		
		String pw = mapTest.getMap("lee");
		System.out.println(pw);
//		
//		
//		Map<String,Integer> map = new HashMap<String, Integer>();
//		map.put("age", 23);
//		map.put("id", 6);
//		
//		int age = map.get("age");
//		System.out.println(age);
//		System.out.println(map.get("id"));
//		
//		Map<String,DevVo> mapVo=new HashMap<String, DevVo>();
//		DevVo vo=new DevVo();
//		vo.setId(1);
//		vo.setName("홍길동");
//		vo.setAddress("서울");
//		vo.setAge(20);
//		
//		mapVo.put("홍길동", vo);
//		
//		vo=new DevVo();
//		vo.setId(2);
//		vo.setName("박수동");
//		vo.setAddress("대구");
//		vo.setAge(23);
//		mapVo.put("박수동", vo);
//		
//		DevVo vo1 = new DevVo();
//		vo1 = mapVo.get("박수동");
//		System.out.println(vo1.toString());

			map.put("car", new Car());
			map.put("bicle", new Bicle());

			Command command = map.get("bicle");
			command.run();

		}

	}

