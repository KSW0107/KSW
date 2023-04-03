package HW0403;

public class PortableNotebook implements Notebook,Tablet {

	int mode;
	String wordProgram;
	String internet;
	String video;
	String app;
	
	public PortableNotebook() {
		mode = NOTEBOOK_MODE;
		System.out.println(mode==1 ? "NOTEBOOK_MODE" : "TABLET_MODE" );		 
	}
		
	
	
	
	
	@Override
	public void watchVideo(String video) {
		System.out.println(video+" 영상 종류 시청");
	}

	@Override
	public void useApp(String app) {
		if(mode == 1) {
			mode = TABLET_MODE;
			System.out.println(app+" 를 실행");
		}else if(mode==2){
			System.out.println(app+" 를 실행");
		}
	}

	@Override
	public void writeDocumentaion(String wordprogram) {
		System.out.println(wordprogram+" 통해 문서를 작성");
	}

	@Override
	public void searchInternet(String internet) {
		System.out.println(internet+" 통해 인터넷을 검색");
	}

	public void changeMode() {
		if (mode == TABLET_MODE) {
			mode = NOTEBOOK_MODE;
		} else if (mode == NOTEBOOK_MODE) {
			mode = TABLET_MODE;
		}
		
		System.out.println("현재 모드 :" + (mode==1 ? "NOTEBOOK_MODE" : "TABLET_MODE" ));
		
	}

}
