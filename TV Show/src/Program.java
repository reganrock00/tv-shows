import java.util.*;
public class Program 
{ 

	public static void main(String[] args) 
	{
//		PrintList();
		DoTheRest();
		
	}

	private static void DoTheRest() 
	{
		ArrayList <Shows> programs = new ArrayList <Shows>();
		programs.add(new Shows ("Archer", "Comedy", 8));
		programs.add(new Shows ("Gotham", "Action", 4));
		programs.add(new Shows ("Top Gear", "Entertainment", 24));
		programs.add(new Shows ("Office", "Comedy", 9));
		programs.add(new Shows ("Futurama", "Comedy", 10));
		for (int x = 0; x < programs.size(); x++)
		{
			System.out.println(programs.get(x).getName() + " is an " + programs.get(x).getGenre() + " show with " + programs.get(x).getSeasons() + " seasons.");
			programs.get(x).setSeasons(programs.get(x).getSeasons() + 1);
		}
		System.out.println();
		for (int i = 0; i < programs.size(); i++)
		{
			System.out.println(programs.get(i).getName() + " now has " + programs.get(i).getSeasons() + " seasons.");
		}
		System.out.println();
		
		int lon = 0;
		String longestName = "";
		for (int r = 0; r < programs.size(); r++)
		{
			if(programs.get(r).getName().length() > lon)
			{
				longestName = programs.get(r).getName();
			}
		}
		for (int q = 0; q < programs.size(); q++)
		{
			if(programs.get(q).getName().equals(longestName))
			{	
				programs.remove(q);
			}
		}
		for (int g = 0; g < programs.size(); g++)
		{
			System.out.println(programs.get(g).getName() + " is an " + programs.get(g).getGenre() + " show with " + programs.get(g).getSeasons() + " seasons.");
		}
//		PrintList();
	}

//	private static void PrintList() 
//	{
//		for (int x = 0; x < programs.size(); x++)
//			{
//				System.out.println(programs.get(x).getName() + " is an " + programs.get(x).getGenre() + " show with " + programs.get(x).getSeasons() + " seasons.");
//			}
//	}
	

}
