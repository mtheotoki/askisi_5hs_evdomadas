package ex4;


public class Singer {

		static Singer sing[] = new Singer [10];		
		private String name;
		private int id  ;

		static int counter = 0;


	
		public Singer(String name, int id) {  
			//δε βαζουμε 2 ορίσματα "public Singer(String name1, int id1)" γιατι στην 
			//τριτη κλαση "SongTest" βάζουμε ένα όρισμα στο Singer, το όνομα. 
			
			this.name = name;
			this.id = id;
			sing[counter]=this;
			++counter;
		}

				
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		
		}

	

		public String toString() {
			return "Singer [name = " + name + " id = " + id + "]";
		}
	}
