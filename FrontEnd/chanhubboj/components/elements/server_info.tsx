import { ServerInfoComponentProps } from "../interfaces/server_types";
import Text from "../elements/text";

export default function ServerInfoComponent(probs: ServerInfoComponentProps) {
  return <Text text={"등록된 풀이 코드 : " + probs.serverInfo.solvedProblemCount + "개"}></Text>;
}
