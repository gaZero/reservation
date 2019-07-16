<%@page contentType="text/html; charset=utf-8"%>
	<table class="read_table">
		<tr>
			<td class="read_title"></td>
		</tr>
		<tr>
			<td class="read_info">
		</tr>
		<tr>
			<td><a class="read_content"></a></td>
		</tr>
	</table>

	<div class="read_btn_div"><button class="update_btn">수정</button><button class="delete_btn">삭제</button></div>
		<div class="datgle_div">
			<a style="color:salmon;margin-left:3%">✍</a><a>댓글</a><br/>
			<textarea class="datgle" rows="2" cols="20" wrap="hard" ></textarea>
			<button class="datgle_btn">등록</button>
	</div>
	
	<div class="comment_div">
		<table class="comment_table"></table>
	</div>