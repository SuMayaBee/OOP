class Box {
	double width;
	double height;
	double depth;
	Box() {
		
	}
	Box(double width, double height) {
		System.out.println("Constructing Box");
		this.width = width;
		this.height = height;
		depth = 3;
	}
	double volume() {
		double volume = 0;
//		System.out.println(volume);
		volume = width * height * depth;
		return volume;
	}
}
