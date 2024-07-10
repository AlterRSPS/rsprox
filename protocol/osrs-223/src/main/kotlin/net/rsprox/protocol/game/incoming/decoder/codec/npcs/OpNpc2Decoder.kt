package net.rsprox.protocol.game.incoming.decoder.codec.npcs

import net.rsprot.buffer.JagByteBuf
import net.rsprot.protocol.ClientProt
import net.rsprot.protocol.message.codec.MessageDecoder
import net.rsprot.protocol.tools.MessageDecodingTools
import net.rsprox.protocol.game.incoming.decoder.prot.GameClientProt
import net.rsprox.protocol.game.incoming.model.npcs.OpNpc

public class OpNpc2Decoder : MessageDecoder<OpNpc> {
    override val prot: ClientProt = GameClientProt.OPNPC2

    override fun decode(
        buffer: JagByteBuf,
        tools: MessageDecodingTools,
    ): OpNpc {
        val index = buffer.g2Alt3()
        val controlKey = buffer.g1() == 1
        return OpNpc(
            index,
            controlKey,
            2,
        )
    }
}