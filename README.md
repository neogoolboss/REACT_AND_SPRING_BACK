- 백엔드에서 config 클래스 추가해서 Cors설정함
    
      @Configuration
      public class WebConfig implements WebMvcConfigurer {
      
          @Override
          public void addCorsMappings(CorsRegistry registry) {
              registry.addMapping("/**")
                      .allowedOrigins("http://localhost:3000")
                      .allowedMethods("GET", "POST", "PUT", "DELETE")
                      .allowCredentials(true);
          }
      }



- 아래는 리액트

      /* 백엔드 연결 테스트 */
      const [data, setData] = useState([]);
  
      useEffect(() => {
          fetch("/mypage")
              .then((res) => res.json())
              .then((result) => {
                  // result가 배열인지 확인하고 배열이 아닐 경우 빈 배열로 설정
                  if (Array.isArray(result)) {
                      setData(result);
                  } else {
                      console.error("Data is not an array:", result);
                      setData([]);
                  }
              })
              .catch((error) => {
                  console.error("Error fetching data:", error);
                  setData([]);
              });
      }, []);
  
      return(
          <ul>
             {data.map((v,idx)=><li key={`${idx}-${v}`}>{v}</li>)}
          </ul>
      )


- 결과창 : 백엔드 출력은 8080번에서 확인 가능하고 리액트 3000번으로 불러와서 사용.
  ![image](https://github.com/neogoolboss/REACT_AND_SPRING_BACK/assets/157683242/a6709502-2470-4bb7-be96-fb66dfc20802)
