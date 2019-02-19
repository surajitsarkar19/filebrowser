package com.srs.filebrowser.utils;

import com.srs.filebrowser.model.FileFolder;

public class FileCache extends LRUCache<String,FileFolder> {
	
	public FileCache() {
		super(4);
	}
	
	public FileFolder getFile(String key) {
		return getEntry(key);
	}
	
	public void setEntry(FileFolder file) {
		
	}

}
