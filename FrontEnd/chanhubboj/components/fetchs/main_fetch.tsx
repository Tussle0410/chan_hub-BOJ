import { ServerInfo } from "../interfaces/server_types";

async function FindServerInfo() {
  const response = await fetch("http://localhost:8080/v1/chan_hub/api/info");
  const error_code = response.ok ? false : response.status;
  const json = await response.json();
  return {
    error_code,
    json,
  };
}

export async function getServerSideProps() {
  const response = await FindServerInfo();
  const serverInfo: ServerInfo = response.json;
  const errorCode = response.error_code;
  return {
    props: {
      serverInfo,
      errorCode,
    },
  };
}
