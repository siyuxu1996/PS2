package PKGemptry;

public class MyInteger {
		private int iValue;
		public MyInteger(int iValue) {
			this.iValue = iValue;
		}
		public int getiValue() {
			return iValue;
		}
		public boolean isEven() {
			if ((iValue % 2) == 0) {
				return true;
			} else{
			return false;
		}
	}
		public boolean isOdd() {
			if ((iValue % 2) == 1) {
				return true;
			} else{
			return false;
		}
	}
		public boolean isPrime() {
			for(int iValue = 2; iValue <getiValue();iValue++) {
		        if(getiValue()%iValue==0)
		            return false;
		    }
		    return true;
		}
		public static boolean isEven(int i) {
			if(i % 2 == 0) {
				return true;
			} else{
				return false;
			}
		}
		public static boolean isOdd(int i) {
			if(i % 2 == 1) {
				return true;
			} else{
				return false;
			}
		}
		public static boolean isPrime(int i) {
			if (i<=1){return false;}
			for(int k=2; k<i; k++)
				if (i % k == 0)
					return false;
			return true;
		}
		public static boolean isPrime(MyInteger a) {
			return a.isPrime();
		}
		public static boolean isEven(MyInteger a) {
			return a.isEven();
		}
		public static boolean isOdd(MyInteger a) {
			return a.isOdd();
		}
		public boolean equals(int a) {
			return iValue == a;
		}
		public boolean equalsmyinteger(MyInteger a) {
			return a.equals(a.getiValue());
		}
}