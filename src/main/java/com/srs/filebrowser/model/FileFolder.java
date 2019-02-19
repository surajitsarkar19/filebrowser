package com.srs.filebrowser.model;

import java.io.File;
import java.net.URI;
import java.util.Comparator;

public class FileFolder extends File implements Comparator<FileFolder>{
	
	private boolean root;

	public FileFolder(String parent, String child) {
		super(parent, child);
	}

	public FileFolder(String pathname) {
		super(pathname);
	}

	public FileFolder(URI uri) {
		super(uri);
	}

	public FileFolder(File parent, String child) {
		super(parent, child);
	}
	
	public FileFolder(File file) {
		this(file,false);
	}
	
	public FileFolder(File file, boolean isRoot) {
		super(file.getAbsolutePath());
		this.root = isRoot;
	}

	public boolean isRoot() {
		return root;
	}

	public void setRoot(boolean root) {
		this.root = root;
	}

	@Override
	public int compare(FileFolder o1, FileFolder o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}

}
