package ch8;
	
	class UnsupportedFuntionException extends RuntimeException{
		private final int ERR_CODE;
		
		UnsupportedFuntionException(String msg, int errCode){ // 생성자
			super(msg);
			ERR_CODE = errCode;
		}
		UnsupportedFuntionException(String msg){ // 생성자
			this(msg, 100); // ERR_CODE를 100(기본값)으로 초기화한다.
		}
		
		public int getErrCode() {
			
			return ERR_CODE;
		}
		
		public String getMessage() {
			
			return "["+getErrCode()+"]"+super.getMessage();
		}
	}
	
	
class Exercise8_9 {
	public static void main(String[] args) throws Exception{
		throw new UnsupportedFuntionException("지원하지 않는 기능입니다.", 100);

	}

}
