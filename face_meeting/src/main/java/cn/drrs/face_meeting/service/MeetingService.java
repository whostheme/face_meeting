package cn.drrs.face_meeting.service;

import java.sql.Time;
import java.util.List;
import java.util.Set;

import cn.drrs.face_meeting.entity.Meeting;
import cn.drrs.face_meeting.entity.ResponseData;
import cn.drrs.face_meeting.util.NoteResult;

//管理会议模块
public interface MeetingService {
	//【管理与自己相关的会议】
	//发起（添加）会议
	public NoteResult<Object> add(String mTitle, int mSize, int mSpan,String pId_FQ);
	//删除会议
	public NoteResult<Object> delete(int mNo);
	//更新会议
	public NoteResult<Object> update(int mNo,String mTitle,String mInfo,int mSize,int mSpan,String tName);
	//按字段查找会议
	public NoteResult<List<Meeting>> findByFields(Meeting m);
	//按编号查找唯一会议
	public NoteResult<Meeting> findBymNo(int mNo);
	/*Person集合映射
	//查找我创建的会议(按发起者Id查询)
	public NoteResult<List<Meeting>> findByCreator(String pId_FQ);
	//查找和我相关的会议
	public NoteResult<List<Meeting>> findByPM_inform(String pId);
	//查找我要参加的会议
	public NoteResult<List<Meeting>> findByPM_attend(String pId);
	*/
	//【审批会议】
	//通过会议
	//退回会议
	//【】
	public ResponseData findAllRoomByPage(int page, int limit);

}