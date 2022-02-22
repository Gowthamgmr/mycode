package week3.day1.MethodOverloading;

public class Sports {
		public void acheiver(String  name,int medalCount) {
			System.out.println("Name is: "+name);
			System.out.println("Medal Count:"+medalCount);
		}
		public void acheiver(String country ,String sportName, int rank) {
			System.out.println("Country name: "+country);
			System.out.println("Game name is:"+sportName);
			System.out.println("Rank:"+rank);
		}
		public void acheiver(float weight, int height, long contactNo) {
			System.out.println(weight);
			System.out.println("Height:"+height);
			System.out.println("ContactNo:"+contactNo);
		}
		public void acheiver(String tournamentName, long prizeMoney) {
			System.out.println("Tournament Name:"+tournamentName);
			System.out.println("Prize Money:"+prizeMoney);
		}
		public static void main(String[] args) {
			Sports get=new Sports();
			get.acheiver("Gowtham Ramaswamy", 8);
			get.acheiver("India", "WWE", 1);
			get.acheiver(70, 170,730555735 );
			get.acheiver("Olympic", 20000);

	}

}
