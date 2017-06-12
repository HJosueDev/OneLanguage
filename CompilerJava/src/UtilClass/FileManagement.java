package UtilClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Henrry Josue Lopez
 */
public class FileManagement {
    FileInputStream into;
    FileOutputStream exit;
    File file;
    
    
    public FileManagement(){
        
    }
    
    public String getContent(File file){
        String content="";
        
        try{
            into= new FileInputStream(file);
            int ascci;
            while ((ascci=into.read())!=-1){
                char caracter = (char) ascci;
                content+=caracter;
            }
        }catch(Exception e){
        }
        
        return content;
    }
    
    public String saveContent(File file, String content){
        String answer=null;
        
        try{
            exit = new FileOutputStream(file);
            byte[] bytesContent=content.getBytes();
            exit.write(bytesContent);
            answer = "Se guardo Exitosamente";
        }catch(Exception e){
            
        }
        return answer;
    }
    
    public byte[] getImage(File file){
        byte[] bytesImage=new byte[1024*100];
        
        try{
            into=new FileInputStream(file);
            into.read(bytesImage);
        }catch(Exception e){
            
        }
        return bytesImage;
    }
    
    public String saveImage(File file, byte[] image){
        String answer=null;
        
        try{
            exit = new FileOutputStream(file);
            exit.write(image);
            answer = "Se guardo Exitosamente";
        }catch(Exception e){
            
        }
        return answer;
    }
}

