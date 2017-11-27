package cn.tedu.ssh.action;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import cn.tedu.ssh.action.bean.User;

public class DownloadExcelAction {
    private InputStream excelInputStream;
    
	

	public InputStream getExcelInputStream() {
		return excelInputStream;
	}



	public void setExcelInputStream(InputStream excelInputStream) {
		this.excelInputStream = excelInputStream;
	}



	public String execute(){
		try{
	        //arg0�����ݵľۺ�
			List<?> data = getUserList();
			//arg1�����������ݵ�����
			Class<?> clazz = data.getClass(); 
		    //����������
		    HSSFWorkbook workbook = new HSSFWorkbook();
		    //����������
		    HSSFSheet sheet = workbook.createSheet("sheet1");
		    //������һ��
		    HSSFRow row = sheet.createRow(0);
		    //��ȡ���ݵ��ֶ��б�
		    Field[] fields = clazz.getDeclaredFields(); 
		    //����������Ԫ��
		    for(int i=0;i<fields.length;i++){
		    	//���õ�ǰ�ֶοɼ�
		    	fields[i].setAccessible(true);
		    	//������Ԫ��
		    	HSSFCell cell = row.createCell((short)i);
		    	//��Ƶ�Ԫ�����������
		    	if("java.lang.Integer".equals(fields[i].getType().getName())){
		    		cell.setCellType(HSSFCell.CELL_TYPE_NUMERIC);
		    	}else{
		    		cell.setCellType(HSSFCell.CELL_TYPE_STRING);
		    	}
		    	//�������
		    	cell.setCellValue(fields[i].getName());
		    }
		    HSSFCell c0 = row.createCell((short)0);
		    HSSFCell c1 = row.createCell((short)1);
		    HSSFCell c2 = row.createCell((short)2);
		    HSSFCell c3 = row.createCell((short)3);
		 //��Ƹ���Ԫ�����������
		 c0.setCellType(HSSFCell.CELL_TYPE_STRING);
		 c1.setCellType(HSSFCell.CELL_TYPE_STRING);
		 c2.setCellType(HSSFCell.CELL_TYPE_STRING);
		 c3.setCellType(HSSFCell.CELL_TYPE_STRING);
		 //�������
		 c0.setCellValue("username");
		 c1.setCellValue("password");
		 c2.setCellValue("mobilePhoneNumber");
		 c3.setCellValue("email");
		 //�����ڶ���
		 row = sheet.createRow(1);
		 c0 = row.createCell((short)0);
		 c1 = row.createCell((short)1);
		 c2 = row.createCell((short)2);
		 c3 = row.createCell((short)3);
		 c0.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 c1.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 c2.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 c3.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 //�������
		 c0.setCellValue("С��");
		 c1.setCellValue("1234");
		 c2.setCellValue("13664456455");
		 c3.setCellValue("787987@qq.com");
		
		 //�����ڶ���
		 row = sheet.createRow(2);
		 //���4����Ԫ�����������(�Ǳ�Ҫ)
		 c0 = row.createCell((short)0);
		 c1 = row.createCell((short)1);
		 c2 = row.createCell((short)2);
		 c3 = row.createCell((short)3);
		 c0.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 c1.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 c2.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 c3.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 //�������
		 c0.setCellValue("С��");
		 c1.setCellValue("12345");
		 c2.setCellValue("13664568789");
		 c3.setCellValue("78978@qq.com");
		
		 //������д�������������
		 ByteArrayOutputStream out = new ByteArrayOutputStream();
		 workbook.write(out);
		 //ͨ��������õ����ݵ�byte[]
		 byte[] bytes = out.toByteArray();
		 //�ر���
		 out.close();//��������Է����Ҫclose();
		 //����byte[]��������������,�Է��ظ��ͻ���
		 setExcelInputStream(new ByteArrayInputStream(bytes));
		 return "success";
	   }catch(Exception e){
		   e.printStackTrace();
	   }
		return "error";
	}
	private List<User> getUserList(){
			List<User> user = new ArrayList<User>();
			
			return user;
	}
}
