package ex4;

import java.util.Scanner;


public class SongTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		//Singer sing[] = new Singer [10];//���������� ������ 10 ������ ��� ����������� ����� Singer
		//Song songs[] = new Song [10];//���������� ������ 10 ������ ��� ����������� ����� Song

		Singer frank = new Singer ("Frank Sinatra", 0);//���������� ������������ �� ������� ��� ���� ������� (���������) frank
		Singer wham = new Singer ("Wham!", 1);
		Singer mariah = new Singer ("Mariah Carey", 2);
		Singer chris = new Singer ("Chris Rea", 3);
		Singer sia = new Singer ("Sia", 4);
		
		new Song ("All I Wanth for Christmas Is You", mariah, "https://www.youtube.com/watch?v=yXQViqx6GMY");
		new Song ("White Christmas",frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA");
		new Song ("Last Christmas",wham, "https://www.youtube.com/watch?v=E8gmARGvPlI" );		
		new Song ("Driving home for christmas",chris, "https://www.youtube.com/watch?v=EvDxSW8mzvU");
		new Song ("Santa's Coming For Us",sia, "https://www.youtube.com/watch?v=V3EYjVPRClU" );
		new Song ("Let It Snow! Let It Snow! Let It Snow!",frank, "https://www.youtube.com/watch?v=vGRC2LYmHfU" );
		
		/*sing[0]=frank;//���������� ���� ������ Singer
		sing[1]=wham;
		sing[2]=mariah;
		sing[3]=chris;
		sing[4]=sia;
						
		songs[0]=song1;//���������� ���� ������ Song
		songs[1]=song2;
		songs[2]=song3;
		songs[3]=song4;
		songs[4]=song5;
		songs[5]=song6; */
		
		
		
	
		while (true){//� ������� �� ����� ����� ������
			System.out.println("***************** Welcome to our DMST Christmas Music Application***************");
			System.out.println("----Menu----");
			System.out.println("Type 1 to display singers' list");
			System.out.println("Type 2 to display Frank's Sinatra available songs");
			System.out.print("	Type here: ");
			
			
			int choice = scanner.nextInt();

			if (choice == 1){
				System.out.println("	** Display Singers' List **");
				for (int i=0; i<Singer.sing.length; i++ ){//�������� ���� ��� ������������ ��� ������ (��� ����� ������� � �������)
					if (Singer.sing[i]!= null)//�� ������� ����������� ��� ����
						System.out.println(Singer.sing[i].toString());//������ ��� toString ��� �� ����������� ����
				}
			}
			else if (choice == 2 ){
				int metritis = 0;
				
				for(int i=0; i<Song.songs.length; i++){
					if(Song.songs[i]!= null){//�� ������ ���� ���� ���� ������
						if(Song.songs[i].getSinger()==frank) {
							metritis = metritis+1;
						}	
					}
				}
				System.out.println(metritis +" songs");
				
				for(int i=0; i<Song.songs.length; i++){
					if(Song.songs[i]!= null){//�� ������ ���� ���� ���� ������
						if(Song.songs[i].getSinger()==frank) {
						System.out.println ("Title: " +Song.songs[i].toString()); 
						}	
					}
				}	
			}
			
			if ((choice !=1)&& (choice!=2)) {
				System.out.println( "Lathos epilogi. Dokimase pali");
			}
		}
	}		
}			
			
			
			