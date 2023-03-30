import java.util.Scanner;

public class hw0330 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
// 1) 메뉴는 다음과 같이 구성하세요.
// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
// 3) 제품별 가격을 출력하세요.
//	출력예시, "상품명 : 가격"
// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
				
		Scanner sc = new Scanner(System.in);
		Product pd[] = null;
		int pdCount = 0;
		
		while(true) {
			System.out.println("1. 상품 수 입력 | 2.상품 및 가격입력 | 3. 제품별 가격입력 | 4.분석 | 5.종료");
			System.out.println("사용할 메뉴 입력 >");
			int menu = Integer.parseInt(sc.nextLine());
			
			if(menu==1) {
				System.out.println("상품 수 입력 >");
				pdCount = Integer.parseInt(sc.nextLine());
			}else if(menu==2) {
				pd = new Product[pdCount];
				for(int i=0; i<pdCount; i++) {
					pd[i] = new Product();
					System.out.println((i+1)+"번째 상품이름 입력");
					pd[i].name = sc.nextLine();
					System.out.println((i+1)+"번째 상품가격 입력");
					pd[i].price=Integer.parseInt(sc.nextLine());
				}
			}else if(menu==3) {
				for(int i =0; i<pdCount;i++) {
					System.out.println(pd[i].name +":"+ pd[i].price+"원");
				}
			}else if(menu==4) {
				int max = pd[0].price;
				String maxname = ""; 
				int sum = 0;
				for(int i=0;i<pdCount;i++) {
					if(max<pd[i].price) {
						max = pd[i].price;
						maxname = pd[i].name;
					}				
				}
				for(int i=0;i<pdCount;i++) {
					if(pd[i].price!=max) {
					sum += pd[i].price;
					}
				}
				System.out.println("최고가격의 제품과 가격 ("+maxname+":"+max+"원 )");
				System.out.println("최고가격의 제품을 제외한 제품들의 가격 총합 :" +sum+"원");
			}else if(menu==5) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("입력이 잘 못 되었습니다.");
			}
		}
		
	}

}
