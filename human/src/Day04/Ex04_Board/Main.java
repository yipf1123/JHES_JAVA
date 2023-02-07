package Day04.Ex04_Board;

import java.util.Date;
import java.util.Scanner;

/**
 * 게시판 프로그램 - 메뉴판 - 게시글 목록 - 게시글 등록 - 게시글 읽기 - 게시글 쓰기 - 게시글 수정 - 게시글 삭제
 *
 */
public class Main {

	static int max = 10;
	static Board[] boardList = new Board[max];
	static int index = 0;

	// 메뉴판
	public static void showMenu() {
		System.out.println("######### 메뉴판 #########");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 읽기");
		System.out.println("3. 게시글 쓰기");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("######### 번호 입력 : ");
	}

	// 게시글 목록
	public static void list() {
		System.out.println("# 게시글 목록");
		for (Board board : boardList) {
			if (board == null) {
				System.out.println("(게시글 없음)");
			} else {
				System.out.println(board);
			}
		}
	}

	// 게시글 읽기
	public static void read(int boardNo) {
		System.out.println("# 게시글 읽기");
		Board board = boardList[boardNo - 1];
		System.out.println(board);
	}

	public static void write(Board board) {
		if (index < max) {
			boardList[index] = board;
			index++;
			board.setBoardNo(index);
			System.out.println("# 게시글이 작성되었습니다.");
		} else {
			System.out.println("# 게시글 목록이 꽉 찼습니다.");
		}

	}

	public static void update(Board board) {
		int boardNo = board.getBoardNo();

		if (boardNo >= 1 && boardNo <= max && boardList[boardNo - 1] == null) {
			board.setUpdDate( new Date() );
			boardList[boardNo - 1] = board;
			System.out.println("# 게시글이 수정되었습니다.");
		} else {
			System.out.println("# 게시글이 존재하지 않습니다.");
		}

	}

	public static void delete(int boardNo) {
		if (boardNo >= 1 && boardNo <= max) {
			// null : 값이 없음
			boardList[boardNo - 1] = null;
			System.out.println("# 게시글이 삭제되었습니다.");
		} else {
			System.out.println("# 게시글이 존재하지 않습니다.");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		int count = 0;

		do {
			showMenu();
			menuNo = sc.nextInt();
			sc.nextLine();

			int boardNo = 0;
			String title = "";
			String content = "";
			String writer = "";
			Board board = null;

			switch (menuNo) {
			case 1:
				list();
				System.out.println("총 게시글 개수 : " + index);
				break;
			case 2:
				System.out.print("게시글 번호 : ");
				boardNo = sc.nextInt();
				sc.nextLine();
				read(boardNo);
				break;
			case 3:
				System.out.print("제목 : ");
				title = sc.nextLine();
				System.out.print("작성자 : ");
				writer = sc.nextLine();
				System.out.print("내용 : ");
				content = sc.nextLine();
				board = new Board(title, content, writer);
				count = index + 1;
				write(board);
				break;
			case 4:
				System.out.print("게시글 번호 : ");
				boardNo = sc.nextInt();
				sc.nextLine();
				System.out.print("제목 : ");
				title = sc.nextLine();
				System.out.print("작성자 : ");
				writer = sc.nextLine();
				System.out.print("내용 : ");
				content = sc.nextLine();
				board = boardList[boardNo-1];
				board.setTitle(title);
				board.setContent(content);
				board.setWriter(writer);
				update(board);
				break;
			case 5:
				System.out.print("게시글 번호 : ");
				boardNo = sc.nextInt();
				sc.nextLine();
				count = index + 1;
				delete(boardNo);
				break;

			default:
				break;
			}

		} while (menuNo != 0);

		sc.close();

	}

}
