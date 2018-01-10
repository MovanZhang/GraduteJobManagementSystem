package cn.edu.action;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class MultiFileAction extends ActionSupport {
	private File[] multiFile;		//用来封装上传的文件
	private String[] multiFileContentType;//用来封装上传文件的类型
	private String[] multiFileFileName;	//用来封装上传文件的文件名
	private String savePath = "/upload";
	//省略属性的getter、setter方法
	public File[] getMultiFile() {
		return multiFile;
	}
	public void setMultiFile(File[] multiFile) {
		this.multiFile = multiFile;
	}
	public String[] getMultiFileContentType() {
		return multiFileContentType;
	}
	public void setMultiFileContentType(String[] multiFileContentType) {
		this.multiFileContentType = multiFileContentType;
	}
	public String[] getMultiFileFileName() {
		return multiFileFileName;
	}
	public void setMultiFileFileName(String[] multiFileFileName) {
		this.multiFileFileName = multiFileFileName;
	}
	public String getSavePath() {
		return savePath;
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}

	public String execute() throws Exception {
		File[] files=this.getMultiFile();	//取的文件数组
		for (int i = 0; i < files.length; i++) {	//循环每个上传的文件
			InputStream is = new FileInputStream(files[i]);//基于files[i]创建一个文件输入流
			String uploadPath = ServletActionContext.getServletContext()
					.getRealPath(savePath);// 获得上传文件目录实际路径
			File toFile = new File(uploadPath, this.getMultiFileFileName()[i]);// 设置目标文件
			OutputStream os = new FileOutputStream(toFile);// 构建一个输出流
			byte[] buffer = new byte[1024];		//设置缓存
			int length = 0;
			while ((length = is.read(buffer)) > 0) {//读取files[i]文件输出到toFile文件中
				os.write(buffer, 0, length);
			}
			is.close();//关闭输入流
			os.close();//关闭输出流
		}		
		return SUCCESS;
	}
}