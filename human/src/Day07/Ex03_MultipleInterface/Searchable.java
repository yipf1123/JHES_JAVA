package Day07.Ex03_MultipleInterface;

// 검색 인터페이스
public interface Searchable {

	// 채널 검색
	// : 검색어에 해당하는 채널번호를 반환
	int channelSearch(String Keyword);
	
	//컨텐츠 검색
	String[] contentSearch(String keyword);


}
