package renshu15_02;

public class ccpath {
	public String concatPath(String folder, String file) {
		String str;
		str = folder;
		
		if(!folder.endsWith("\\")) { //←文字列の末尾に\記号(\\で指定がルール)がないか(!で)を判断
			folder += "\\"; //\記号がなければ、folderに\を追加する処理
		}
		str = str + file;
		return folder + file;
	}
}
