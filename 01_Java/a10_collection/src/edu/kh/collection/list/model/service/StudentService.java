package edu.kh.collection.list.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import edu.kh.collection.list.model.dto.Student;

public class StudentService {
	
	//필드
	private List<Student> studentList = new LinkedList<Student>();// 추가 , 제거 효율이 좋은 List
	//= new ArrayList<Student>();  // 검색 효율이 좋은 List
	
	public StudentService() {
		
		studentList.add(new Student(3, 5, 17, "홍길동", 'M', 75));
		studentList.add(new Student(2, 4, 13, "김갑순", 'F', 65));
		studentList.add(new Student(3, 1, 15, "김미영", 'F', 90));
		studentList.add(new Student(1, 1, 12, "이명훈", 'M', 88));
		studentList.add(new Student(2, 1, 10, "김샛별", 'F', 77));
	}
	 


	// param : parameter (전달 인자 == 전달 받은 값)
	/** 학생 추가 service 메서드
	 * @param grade
	 * @param ban
	 * @param number
	 * @param name
	 * @param gender
	 * @param score
	 * @return boolean : true
	 */
	public boolean addStudent(int grade, int ban, int number, String name, char gender, int score) {
		
		// 전달 받은 값을 이용해서 학생 객체를 만들어
		// studentList에 추가 후 boolean 반환
		
		
		
		//return studentList.add(new Student(grade, ban, number, name, gender, score));
		
		//중복 검사 후 추가하기(업그레이드)
		
		// 1) 중복 검사 메서드 호출(중복이면 true, 아니면 false)
		boolean result = duplicateValidation(grade, ban, number, name, gender, score);
		
		// 2) 중복이면 false 반환
		// 아니면 List.add() 호출 후 결과 반환
		if(result) { // true인 경우 == 중복 0
			return false;
		}
		
		return studentList.add(new Student(grade, ban, number, name, gender, score));
		
	}



	public List<Student> selectAllStudent() {
		
		return studentList; // 학생이 저장된 List를 호출한 곳으로 돌려줌
	}



	/** 인덱스가 일치하는 학생 1명 조회
	 * @param index
	 * @return Student 객체 주소 또는 null
	 */
	// studentList의 index 범위를 넘어선 경우
	public Student selectOne(int index) {
		if(index <0 || index>= studentList.size()) {
			return null;
		}
		
		// index범위 정상
		
		return studentList.get(index); 
	}



	/** 인덱스가 일치하는 학생 삭제 service 메서드
	 * @param index
	 * @return Student 객체 주소 또는 null
	 */
	public Student deleteStudent(int index) {
		if(index <0 || index >= studentList.size()) {
			return null;
		}
		
		// List에서 제거된 학생 객체의 주소가 반환
		return studentList.remove(index);
		
		
	
		
	}



	/** 학생 성별 조회 service 메서드
	 * @param gender
	 * @return searchList
	 */
	public List<Student> selectGender(char gender) {
		
		// 1.검색 결과를 저장할 List 부터 생성
		List<Student> searchList = new ArrayList<Student>();
		
		// 2. studentList에서 학생을 한명씩 꺼내서
		// 성별이 gender와 일치하는 학생을
		// searchList에 추가
		
		// 향상된 for문 : for (요소 1개 참조 변수 : 배열 또는 컬렉션)
		// -> 매 반복마다 배열 또는 컬랙셔의 요소를
		// 순서대로 하나씩 꺼내어 참조 변수에 대입하는 반복문
		for(Student s : studentList) {
			
			if(s.getGender() == gender) {
				searchList.add(s);
			}
					
		}
		
		
		return searchList; // 검색 결과가 저장된 List 반환
	}



	/**
	 * @param grade
	 * @return
	 */
	public List<Student> selectGrade(int grade) {
		
		List<Student> searchList = new ArrayList<Student>();
		
		for(Student s : studentList) {
			
			if(s.getGrade()== grade) {
				searchList.add(s);
			}
		}
		
		
		
		return searchList ;
	}



	/**
	 * @param name
	 * @return
	 */
	public List<Student> selectName(String name) {
		List<Student> searchList = new ArrayList<Student>();
		
		for(Student s : studentList) {
			
			// String(객체) 값 비교시 A.equals(B) 사용
			// s.getName()== name (주소 비교)
			// s.getName().equals(name) (객체의 값(필드) 비교)
			
			if(s.getName().equals(name)) { // 이름이 같다묜
				searchList.add(s);
			}
		}
		
		return searchList; // 검색 결과 반환
	}



	/** 학생 중복 확인 service 메서드
	 * @param grade
	 * @param ban
	 * @param number
	 * @param gender
	 * @param score
	 * @param name 
	 * @return 중복 있으면 true, 없으면 false
	 */
	public boolean duplicateValidation(int grade, int ban, int number,String name, char gender, int score) {
		Student s = new Student(grade, ban, number, name, gender, score);
		
		// boolean List.contains(요소)
		//- 요소가 List에 있으면 true, 없으면 false
		
		//* contains 사용 전재조건*
		// 비교하려는 객체(클래스)에 object의 equals()가
		// 오버라이딩 되어있어야 한다!
		
		return studentList.contains(s);
		
	}



	/** 성적 순서로 정렬 service 메서드
	 * @return
	 */
	public List<Student> sortScore() {
		// Object/ Arrays / Collections : 유용한 기능 모음
		
		// Collections : 컬렉션의 유용한 기능 모음
		
		// Collections.sort(List) : 원본 List가 정렬
		// -> 이 기능을 사용하려면
		// List의 요소(Student)에 정렬 기준을 정하는 코드가 있어야함
		
		Collections.sort(studentList);
		// -> 점수 오름차순 (점점 커지는 순서) 정렬
		
		Collections.reverse(studentList);
		// -> List 순서를 뒤집음 (오름 -> 내림)

		
		
		
		return studentList ;
	}

}
