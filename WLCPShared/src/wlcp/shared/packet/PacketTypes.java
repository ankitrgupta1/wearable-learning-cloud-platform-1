package wlcp.shared.packet;

public enum PacketTypes {
	
	START_GAME_INSTANCE,
	END_GAME_INSTANCE,
	GAME_INSTANCE_ERROR,
	GAME_LOBBIES,
	GAME_TEAMS,
	CONNECT,
	CONNECT_ACCEPTED,
	CONNECT_REJECTED,
	DISCONNECT,
	DISCONNECT_COMPLETE,
	HEARTBEAT,
	HEARTBEAT_ALIVE,
	DISPLAY_TEXT,
	SINGLE_BUTTON_PRESS,
	GAME_INSTANCE_STARTED,
	GAME_INSTANCE_STOPPED,
	SEQUENCE_BUTTON_PRESS
}
