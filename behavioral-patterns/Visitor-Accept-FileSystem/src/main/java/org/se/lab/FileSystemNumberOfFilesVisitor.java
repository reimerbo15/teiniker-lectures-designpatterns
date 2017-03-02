package org.se.lab;

public class FileSystemNumberOfFilesVisitor 
	implements FileSystemVisitor
{
	/*
	 * Property: numberOfFiles
	 */
	private int numberOfFiles=0;
	public int getNumberOfFiles()
	{
		return numberOfFiles;
	}

	
	/*
	 * Visitor Methods
	 */
	
	@Override
	public void visit(File file)
	{
		numberOfFiles += 1;
	}

	@Override
	public void visit(Directory dir)
	{
		for(Node n : dir.getNodes())
		{
			visit(n);
		}
	}

	@Override
	public void visit(Node node)
	{
	}
}
