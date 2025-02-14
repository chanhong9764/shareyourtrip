package edu.ssafy.enjoytrip.service.chat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import edu.ssafy.enjoytrip.dto.chat.*;

public interface ChatService {
	List<ChattingRoomDto.ChattingRoomResponseDto> getChattingRoomList(String userId);
	void createChattingRoom(ChattingRoomDto.ChattingRoomCreateRequestDto requestDto);
	void deleteChattingRoom(ChattingDto.DeleteChattingRequest requestDto);
	// 채팅방 참여 기능
	void updateParticipantRoomById(String participantId);
	List<Invitation> getInvitation(String userId);
	void deleteChattingRoomById(String participantId);
	InvitationDto.InvitationResponseDto getInvitationById(ChattingParticipantDto.ChattingParticipantCreateDto participantCreateDto);
	
	// 채팅 관련 기능
	void createChatting(ChattingDto.CreateRequest requestDto);
	List<ChattingDto> getChattingList(ChattingDto.ChattingListRequest requestDto);
}
