package com.srs.filebrowser.service;

import java.util.List;

import com.srs.filebrowser.model.FileFolder;

public interface FileService {
	
	List<FileFolder> getRootDirectories();
	List<FileFolder> listFiles(String path);
	
}
