package com.srs.filebrowser.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srs.filebrowser.controller.AppEnvironment;
import com.srs.filebrowser.model.FileFolder;
import com.srs.filebrowser.service.FileService;

@Service
public class FileServiceImpl implements FileService{
	
	@Autowired
	AppEnvironment environment;
	
	@Override
	public List<FileFolder> getRootDirectories() {
		String rootPath = environment.getRootPath();
		System.out.println("=================="+rootPath);
		List<FileFolder> files = new ArrayList<>();
		File rootFile = new File(rootPath);
		if(rootPath.equals("*") || !rootFile.exists()){
			for(File file :File.listRoots())
				files.add(new FileFolder(file,true));
		} else {
			files.add(new FileFolder(rootFile,true));
		}
		return files;
	}

	@Override
	public List<FileFolder> listFiles(String path) {
		List<FileFolder> fileList = new ArrayList<>();
		Set<FileFolder> dirs = new TreeSet<>();
		Set<FileFolder> files = new TreeSet<>();
		File file = new File(path);
		if(file.exists()) {
			for(File f: file.listFiles()) {
				if(f.isDirectory())
					dirs.add(new FileFolder(f));
				else
					files.add(new FileFolder(f));
			}
		}
		fileList.addAll(dirs);
		fileList.addAll(files);
		return fileList;
	}
	

}
