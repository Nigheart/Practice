package org.com.other.gender;

public enum Gender implements GenderDesc{
	MALE("��")
	{
		public void info() {
			System.out.println("��������");
		}
	},
	FEMALE("Ů"){
		public void info() {
			System.out.println("����Ů��");
		}
	};
	private final String name;
	private Gender(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	/*public void setName(String name) {
		switch (this) {
		case MALE:
			if (name.equals("��")) {
				this.name = name;
			}else {
				System.out.println("��������");
				return;
			}
			break;
		case FEMALE:
			if (name.equals("Ů")) {
				this.name = name;
			}else {
				System.out.println("��������");
				return;
			}
			break;
		default:
			break;
		}
	}*/
	public String getName() {
		return name;
		
	}
	
}
