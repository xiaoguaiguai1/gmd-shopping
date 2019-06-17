package com.springcloud.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.springcloud.common.UploadUtils;
import com.springcloud.vo.ResultValue;






@RestController
public class FileUploadController {
	
	//��application.properties�ļ��л��ָ����ֵ����������Ӧ�ĳ�Ա����
	@Value("${web.user-path}")
	private String userPath;
	
	@Value("${web.goods-path}")
	private String goodsPath;
	
	@RequestMapping("/userUpload")
	public ResultValue userUpload(@RequestParam("userPhoto") MultipartFile file) throws IOException {
		//System.out.println("nini");
		ResultValue rv = new ResultValue();
		try {
			Map<String,Object> map = this.uploadFile(userPath,file);
			if(map != null && map.size() > 0) {
				rv.setCode(0);
				rv.setDataMap(map);
				return rv;
			}
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("�û�ͼ���ϴ�ʧ�ܣ���");
		return rv;
		
	}
	@RequestMapping("/goodsUpload")
	public ResultValue goodsUpload(@RequestParam("goodsPhoto") MultipartFile file){
		ResultValue rv = new ResultValue();
		try {
			Map<String,Object> map = this.uploadFile(goodsPath, file);
			if(map != null && map.size() > 0) {
				rv.setCode(0);
				rv.setDataMap(map);
				return rv;
			}
		}catch(IOException e){
			
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("��Ʒͼ���ϴ�ʧ�ܣ���");
		return rv;
		
	}
	
	/**
	 * ɾ����ƷͼƬ
	 * @param goodsPhoto	��ƷͼƬ
	 * @return
	 */
	@RequestMapping("/deleteGoodsPhoto")
	public ResultValue deleteGoodsPhoto(@RequestParam("goodsPhoto") String goodsPhoto) {
		ResultValue rv = new ResultValue();
		
		try {
			//��url�л����ƷͼƬ������
			int indexOf = goodsPhoto.lastIndexOf("/");
			if(indexOf != -1) {
				String fileName = goodsPhoto.substring(indexOf + 1);
				System.out.println(fileName);
				File file = new File(this.goodsPath + fileName);
				if(file.exists()) {
					if(file.isFile()) {
						file.delete();
						
						rv.setCode(0);
						return rv;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		return rv;
	}
	
	@RequestMapping("/deleteUserPhoto")
	
	public ResultValue deleteUserPhoto(@RequestParam("userPhoto") String userPhoto) {
		ResultValue rv = new ResultValue();
		
		try {
			//��url�л����ƷͼƬ������
			int indexOf = userPhoto.lastIndexOf("/");
			if(indexOf != -1) {
				String fileName = userPhoto.substring(indexOf + 1);
				System.out.println(fileName);
				File file = new File(this.userPath + fileName);
				if(file.exists()) {
					if(file.isFile()) {
						file.delete();
						rv.setCode(0);
						return rv;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		rv.setCode(1);
		rv.setMessage("ʧ�ܣ�");
		return rv;
	}
	
	/**
	 * 
	 * @param path	�ϴ��ļ���·��
	 * @param file	�ϴ����ļ�
	 * @return	�ɹ�����java.utilMap���͵�ʵ�������򷵻�null
	 * @throws IOException 
	 */
	private Map<String,Object> uploadFile(String path,MultipartFile file) throws IOException{
		//����µ��ļ�
		String fileName = UploadUtils.getFileName();
		
		//�����ϴ��ļ����ļ�������ļ�����չ��
		String extendedName = UploadUtils.getExtendeName(file.getOriginalFilename());
		
		//�ϴ��ļ�
		//1.���ļ�ת��Ϊ�ֽ����͵�����
		byte[] bytes = file.getBytes();
		//2.����File��Ķ��󣬲����ö������ϴ�·�����ļ���
		File saveFile = new File(path + fileName + extendedName);
		//3.�ϴ��ļ�
		FileCopyUtils.copy(bytes, saveFile);
		
		Map<String,Object> map = new HashMap<>();
		map.put("fileName",fileName);
		map.put("extendedName",extendedName);
		return map;
	}
	
}
