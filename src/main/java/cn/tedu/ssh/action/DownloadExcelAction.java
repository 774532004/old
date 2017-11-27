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
	        //arg0：数据的聚合
			List<?> data = getUserList();
			//arg1：集合中数据的类型
			Class<?> clazz = data.getClass(); 
		    //创建工作本
		    HSSFWorkbook workbook = new HSSFWorkbook();
		    //创建工作表
		    HSSFSheet sheet = workbook.createSheet("sheet1");
		    //创建第一行
		    HSSFRow row = sheet.createRow(0);
		    //获取数据的字段列表
		    Field[] fields = clazz.getDeclaredFields(); 
		    //创建？个单元格
		    for(int i=0;i<fields.length;i++){
		    	//设置当前字段可见
		    	fields[i].setAccessible(true);
		    	//创建单元格
		    	HSSFCell cell = row.createCell((short)i);
		    	//设计单元格的数据类型
		    	if("java.lang.Integer".equals(fields[i].getType().getName())){
		    		cell.setCellType(HSSFCell.CELL_TYPE_NUMERIC);
		    	}else{
		    		cell.setCellType(HSSFCell.CELL_TYPE_STRING);
		    	}
		    	//添加数据
		    	cell.setCellValue(fields[i].getName());
		    }
		    HSSFCell c0 = row.createCell((short)0);
		    HSSFCell c1 = row.createCell((short)1);
		    HSSFCell c2 = row.createCell((short)2);
		    HSSFCell c3 = row.createCell((short)3);
		 //设计个单元格的数据类型
		 c0.setCellType(HSSFCell.CELL_TYPE_STRING);
		 c1.setCellType(HSSFCell.CELL_TYPE_STRING);
		 c2.setCellType(HSSFCell.CELL_TYPE_STRING);
		 c3.setCellType(HSSFCell.CELL_TYPE_STRING);
		 //添加数据
		 c0.setCellValue("username");
		 c1.setCellValue("password");
		 c2.setCellValue("mobilePhoneNumber");
		 c3.setCellValue("email");
		 //创建第二行
		 row = sheet.createRow(1);
		 c0 = row.createCell((short)0);
		 c1 = row.createCell((short)1);
		 c2 = row.createCell((short)2);
		 c3 = row.createCell((short)3);
		 c0.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 c1.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 c2.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 c3.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 //添加数据
		 c0.setCellValue("小明");
		 c1.setCellValue("1234");
		 c2.setCellValue("13664456455");
		 c3.setCellValue("787987@qq.com");
		
		 //创建第二行
		 row = sheet.createRow(2);
		 //设计4个单元格的数据类型(非必要)
		 c0 = row.createCell((short)0);
		 c1 = row.createCell((short)1);
		 c2 = row.createCell((short)2);
		 c3 = row.createCell((short)3);
		 c0.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 c1.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 c2.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 c3.setCellValue(HSSFCell.CELL_TYPE_STRING);
		 //添加数据
		 c0.setCellValue("小红");
		 c1.setCellValue("12345");
		 c2.setCellValue("13664568789");
		 c3.setCellValue("78978@qq.com");
		
		 //将数据写到输出流对象中
		 ByteArrayOutputStream out = new ByteArrayOutputStream();
		 workbook.write(out);
		 //通过输出流得到数据的byte[]
		 byte[] bytes = out.toByteArray();
		 //关闭流
		 out.close();//连接型西苑都需要close();
		 //基于byte[]创建输入流对象,以返回给客户端
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
