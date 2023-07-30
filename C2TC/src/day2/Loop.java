package day2;

public class Loop {
public static void main(String[]args) {
	double value=0.0d;
	while(value<0.7)
	do {
		value = Math.random();
		System.out.println(value);
	}
	 while(value<0.7);
}
}
