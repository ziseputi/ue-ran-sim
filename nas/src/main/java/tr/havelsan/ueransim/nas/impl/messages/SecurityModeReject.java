package tr.havelsan.ueransim.nas.impl.messages;

import tr.havelsan.ueransim.nas.core.IMessageBuilder;
import tr.havelsan.ueransim.nas.core.messages.PlainMmMessage;
import tr.havelsan.ueransim.nas.impl.enums.EMessageType;
import tr.havelsan.ueransim.nas.impl.ies.IE5gMmCause;

public class SecurityModeReject extends PlainMmMessage {
    public IE5gMmCause mmCause;

    public SecurityModeReject() {
        super(EMessageType.SECURITY_MODE_REJECT);
    }

    public SecurityModeReject(IE5gMmCause mmCause) {
        this();
        this.mmCause = mmCause;
    }

    @Override
    public void build(IMessageBuilder builder) {
        super.build(builder);

        builder.mandatoryIE("mmCause");
    }
}
