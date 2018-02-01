package wlcp.shared.packets;

import java.nio.ByteBuffer;

import wlcp.shared.packet.IPacket;
import wlcp.shared.packet.Packet;
import wlcp.shared.packet.PacketTypes;

public class DisconnectCompletePacket extends Packet implements IPacket {
	
	public DisconnectCompletePacket() {
		super(PacketTypes.DISCONNECT_COMPLETE);
	}
	
	@Override
	public void populateData(ByteBuffer byteBuffer) {
		
		//Call the super method to set the packet type
		super.populateData(byteBuffer);
	}

	@Override
	public ByteBuffer assemblePacket() {
		
		//Call the super method to put the type
		super.assemblePacket();
		
		//Return the buffer
		return super.assembleOutputBytes();
	}
}
