package ass2Que2;

public class Keyboard extends Computer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer K1 = new Keyboard();
		K1.show();
		K1.keyoard();
	}

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Detail of Keyboard");
	}

	@Override
	String keyoard() {
		// TODO Auto-generated method stub
		System.out.println("This is Keyboard used for typing purpose");
		return "This is Keyboard";
	}

	@Override
	String motherboard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String cpu() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String hardDisk() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String joystick() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String monitor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String mouse() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String nic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String os() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String RAM1() {
		// TODO Auto-generated method stub
		return null;
	}

}
