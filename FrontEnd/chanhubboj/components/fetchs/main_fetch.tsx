import { ServerInfo } from "../interfaces/server_types";

async function FindServerInfo() {
  const response = await fetch("http://localhost:8080/v1/chan_hub/api/info");
  return await response.json();
}

export async function getServerSideProps() {
  const serverInfo: ServerInfo = await FindServerInfo();
  return {
    props: serverInfo,
  };
}
