import Head from "next/head";
import Image from "next/image";
import { Inter } from "next/font/google";
import styles from "@/styles/Home.module.css";
import SearchBar from "../components/elements/search_bar";
import Text from "../components/elements/text";
import ServerInfoComponent from "../components/elements/server_info";
import { ServerInfo, IndexProps } from "../components/interfaces/server_types";
import Footer from "../components/elements/footer";
import ErrorDiv from "../components/elements/error_div";

export { getServerSideProps } from "../components/fetchs/main_fetch";

const inter = Inter({ subsets: ["latin"] });

export default function Home(getServerSideProps: IndexProps) {
  const serverInfo: ServerInfo = getServerSideProps.serverInfo;
  const errorCode = getServerSideProps.errorCode;
  if (errorCode != false) {
    return (
      <>
        <Head>
          <title>ChanHub BOJ - 백준 JAVA 풀이 코드 모음</title>
          <meta name="description" content="ChanHub BOJ" />
          <meta name="viewport" content="width=device-width, initial-scale=1" />
          <link rel="icon" href="/favicon.ico" />
        </Head>
        <main className={`${styles.main} ${inter.className}`}>
          <div className={styles.center}>
            <ErrorDiv message="서버가 응답하지 않습니다. 잠시후에 시도해주세요."></ErrorDiv>
          </div>
        </main>
        <Footer></Footer>
      </>
    );
  }
  return (
    <>
      <Head>
        <title>ChanHub BOJ - 백준 JAVA 풀이 코드 모음</title>
        <meta name="description" content="ChanHub BOJ" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="icon" href="/favicon.ico" />
      </Head>
      <main className={`${styles.main} ${inter.className}`}>
        <div className={styles.center}>
          <Image
            className={styles.logo}
            src="/logo.png"
            alt="ChanHub BOJ Logo"
            width={700}
            height={300}
            priority
          />
          <SearchBar></SearchBar>
          <Text text="백준 문제 번호를 입력해주세요."></Text>
          <ServerInfoComponent serverInfo={serverInfo}></ServerInfoComponent>
          <Text text="대부분의 풀이 코드는 Java 언어를 기준으로 작성되어 있습니다."></Text>
        </div>
      </main>
      <Footer></Footer>
    </>
  );
}
