package doggos;

public class runner {

	public static void main(String[] args) {
		int placement = Utils.input();
		int i = 0;
		String end = "";
		for (i=1;i<100;i++) {
		//	i++;
			if (i > 10 && i < 20) end = "th";
			else {
				switch (i%10) {
				case 1:{
					end = "st";
					break;
				}
				case 2:{
					end = "nd";
					break;
				}
				case 3:{
					end = "rd";
					break;
				}
				default:{
					end = "th";
					break;
				}
			}
			}
			if (placement != i) {
				System.out.println(i + end);
			}
		
		}
		//	if (placement != i) {
				;
		}

	}


