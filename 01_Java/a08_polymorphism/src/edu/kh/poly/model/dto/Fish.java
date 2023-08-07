package edu.kh.poly.model.dto;

public class Fish extends Animal {

		private int gill; // 아가미 수
		
		@Override
		public Fish() {
			// super(); // 미작성시 컴파일러가 자동
			
		}

		public Fish(int gill) {
			super();
			this.gill = gill;
		}

		public int getGill() {
			return gill;
		}

		public void setGill(int gill) {
			this.gill = gill;
		}
		
		@Override
		public String toString() {
			return super.toString() + " / " +gill;
					
		}
		
		@Override
		public void breath() {
			System.out.println("물고기는 아가미로 호흡한다");
		}
		
		
}
