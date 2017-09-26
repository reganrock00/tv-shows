
public class Shows
	{
		private String name;
		private String genre;
		private int seasons;
		public Shows (String n, String g, int s)
		{
			name = n;
			genre = g;
			seasons = s;
		}
		public static void main(String[] args)
			{

			}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public int getSeasons() {
			return seasons;
		}
		public void setSeasons(int seasons) {
			this.seasons = seasons;
		}
		

	}
