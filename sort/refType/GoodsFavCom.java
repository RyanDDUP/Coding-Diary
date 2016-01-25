package sort.refType;

public class GoodsFavCom implements java.util.Comparator<Goods>{

		public int compare(Goods o1, Goods o2) {
		return	(o1.getFav()-o2.getFav()>0?1:(o1.getFav()==o2.getFav()?0:-1));
		
			
		
		}

	}

