package ch8;
	
	class UnsupportedFuntionException extends RuntimeException{
		private final int ERR_CODE;
		
		UnsupportedFuntionException(String msg, int errCode){ // ������
			super(msg);
			ERR_CODE = errCode;
		}
		UnsupportedFuntionException(String msg){ // ������
			this(msg, 100); // ERR_CODE�� 100(�⺻��)���� �ʱ�ȭ�Ѵ�.
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
		throw new UnsupportedFuntionException("�������� �ʴ� ����Դϴ�.", 100);

	}

}
